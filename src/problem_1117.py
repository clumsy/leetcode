# from queue import Queue
#
# class _H2O:
#
#     def __init__(self):
#         self.h = Queue(maxsize=2)
#         self.o = Queue(maxsize=1)
#
#     def hydrogen(self, releaseHydrogen: 'Callable[[], None]') -> None:
#         self.h.put('H')
#         releaseHydrogen()
#         if self.h.full():
#             self.o.get()
#
#     def oxygen(self, releaseOxygen: 'Callable[[], None]') -> None:
#         self.o.put('O')
#         releaseOxygen()
#         self.h.get()
#         self.h.get()

from threading import Barrier, Semaphore


class _H2O:
    def __init__(self):
        self.h = Semaphore(2)
        self.o = Semaphore(1)
        self.b = Barrier(3)

    def hydrogen(self, releaseHydrogen: "Callable[[], None]") -> None:
        with self.h:
            releaseHydrogen()
            self.b.wait()

    def oxygen(self, releaseOxygen: "Callable[[], None]") -> None:
        with self.o:
            releaseOxygen()
            self.b.wait()

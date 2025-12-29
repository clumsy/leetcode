class Solution:
    def entityParser(self, text: str) -> str:
        o, e, chunks = 0, -1, []
        m = {
            "&quot;": '"',
            "&apos;": "'",
            "&amp;": "&",
            "&gt;": ">",
            "&lt;": "<",
            "&frasl;": "/",
        }
        while True:
            e = text.find(";", e + 1)
            if e == -1:
                chunks.append(text[o:])
                break
            s = e
            while s >= o and text[s] != "&":
                s -= 1
            chunks.append(text[o:s])
            if s >= o:
                chunk = text[s : e + 1]
                chunks.append(m.get(chunk, chunk))
            else:
                chunks.append(text[o : e + 1])
            o = e = e + 1
        res = "".join(chunks)
        return res

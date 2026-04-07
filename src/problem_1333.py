class Solution:
    def filterRestaurants(
        self, restaurants: List[List[int]], veganFriendly: int, maxPrice: int, maxDistance: int
    ) -> List[int]:
        def order(restaurant):
            id, rating, *_ = restaurant
            return -rating, -id

        restaurants.sort(key=order)
        res = [
            id
            for id, _, vegan, price, distance in restaurants
            if vegan >= veganFriendly and price <= maxPrice and distance <= maxDistance
        ]
        return res

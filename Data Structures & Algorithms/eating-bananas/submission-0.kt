class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var minSpeed = 1
        var maxSpeed = piles.max()

        while(minSpeed < maxSpeed) {
            val mid = (minSpeed + maxSpeed) / 2
            if(canFinish(mid,piles,h)) maxSpeed = mid else minSpeed = mid +1
        }
        return minSpeed
    }

    private fun canFinish(speed: Int, piles: IntArray, h: Int): Boolean {
        val hours = piles.sumOf { pile -> ceil(pile.toDouble()/speed).toLong() }
        return hours <= h
    }
}

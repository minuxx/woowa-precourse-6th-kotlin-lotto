package lotto.models

enum class WinningRank(val number: Int, val amount: Int, val count: Int, val isBonus: Boolean = false) {
    FIRST(1, 2000000000, 6),
    SECOND(2, 30000000, 5, true),
    THIRD(3, 1500000, 5),
    FOURTH(4, 50000, 4),
    FIFTH(5, 5000, 3),
    NOTHING(0, 0, 0);

    companion object {
        fun find(matchedCount: Int, isMatchedBonus: Boolean = false): WinningRank =
            WinningRank.entries.find { it.count == matchedCount && it.isBonus == isMatchedBonus } ?: NOTHING

        fun getSortedWinnings(): List<WinningRank> {
            return entries.sortedWith(
                compareBy({ it.count }, { it.isBonus })
            )
        }
    }
}
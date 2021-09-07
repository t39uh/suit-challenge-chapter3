package elements

import ResultSuit
import Suit

class Paper(name: String) : Suit(name) {

    override fun loseTo(): String {
        return StringContainer.scissors
    }

    override fun winFrom(): String {
        return StringContainer.rock
    }

    override fun drawFrom(): String {
        return this.name
    }
}
public class Blackjack {
    public int parseCard(String card) {
        /*  switch(card){
            case "ace": return 11;
            case "ten": case "jack": case "queen": case "king": return 10;
            case "nine": return 9;
            case "eight": return 8;
            case "seven": return 7;
            case "six": return 6;
            case "five": return 5;
            case "four": return 4;
            case "three": return 3;
            case "two": return 2;
            default: return 0;
        }
        *
        *
        * */
        if(card.equals("ace")) {
            return 11;
        }
        else if(card.equals("ten") || card.equals("jack") || card.equals("queen") || card.equals("king")) {
            return 10;
        }
        else if(card.equals("nine")) {
            return 9;
        }
        else if(card.equals("eight")) {
            return 8;
        }
        else if(card.equals("seven")) {
            return 7;
        }
        else if(card.equals("six")) {
            return 6;
        }
        else if(card.equals("five")) {
            return 5;
        }
        else if(card.equals("four")) {
            return 4;
        }
        else if(card.equals("three")) {
            return 3;
        }
        else if(card.equals("two")) {
            return 2;
        }
        else {
            return 0;
        }
    }
    public boolean isBlackjack(String card1, String card2) {
        // throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
        if (parseCard(card1) + parseCard(card2) == 21) {
            return true;
        } else {
            return false;
        }
    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        // throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
        if(isBlackjack == false) {return "P";}
        else if(isBlackjack == true && dealerScore < 10) {return "W";}
        else if(isBlackjack == true && dealerScore >= 10) {return "S";}
        return "S";
    }
    public String smallHand(int handScore, int dealerScore) {
        // throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
        if(handScore >= 17) {return "S";}
        else if (handScore >= 12 && handScore <= 16 && dealerScore >= 7) {return "H";}
        else if (handScore >= 12 && handScore <= 16) {return "S";}
        else {return "H";}
    }
    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}








package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        if(deck==null||deck.length==0) return deck;
        int len = deck.length;
        int[] result = new int[len];
        Queue<Integer> indexs = new LinkedList();
        for(int i=0;i<len;i++){
           indexs.add(i);
        }

        Arrays.sort(deck);
        for(int card : deck){
            result[indexs.poll()]=card;
            if(!indexs.isEmpty()){
                indexs.add(indexs.poll());
            }
        }
        return result;
    }
}

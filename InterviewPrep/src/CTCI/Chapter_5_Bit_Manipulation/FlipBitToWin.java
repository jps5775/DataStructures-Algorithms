package CTCI.Chapter_5_Bit_Manipulation;

import java.util.ArrayList;

public class FlipBitToWin {
	
	public static int longestSequence(int n) {
		if(n == -1) { return Integer.BYTES * 8; }
		ArrayList<Integer> sequences = getAlternatingSequences(n);
		return findLongestSequence(sequences);
	}
	
	public static ArrayList<Integer> getAlternatingSequences(int n){
		ArrayList<Integer> sequences = new ArrayList<Integer>();
		
		int searchingFor = 0;
		int counter = 0;
		
		for(int i = 0; i < Integer.BYTES * 8; i++) {
			if((n & 1) != searchingFor) {
				sequences.add(counter);
				searchingFor = n & 1;
				counter = 0;
			}
			counter++;
			n >>>= 1;
		}
		sequences.add(counter);
		return sequences;
	}
	
	public static int findLongestSequence(ArrayList<Integer> seq) {
		int maxSeq = 1;
		
		for(int i = 0; i < seq.size(); i = i + 2) {
			int zerosSeq = seq.get(i);
			int onesSeqRight = i - 1 >= 0 ? seq.get(i - 1) : 0;
			int onesSeqLeft = i + 1 < seq.size() ? seq.get(i + 1) : 0;
			
			int thisSeq = 0;
			if(zerosSeq == 0) {
				thisSeq = Math.max(onesSeqLeft, onesSeqRight);
			}else if(zerosSeq > 1) {
				thisSeq = 1 + Math.max(onesSeqLeft, onesSeqRight);
			}else {
				thisSeq = 1 + onesSeqLeft + onesSeqRight;
			}
			
			maxSeq = thisSeq > maxSeq ? thisSeq : maxSeq;
		}
		return maxSeq;
	}
	
	public static void main(String[] args) {
		System.out.println(longestSequence(1775));
	}
}

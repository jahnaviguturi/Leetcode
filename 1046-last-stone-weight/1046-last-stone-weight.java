class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int s: stones) {
            heap.offer(s);
        }

        while(heap.size() > 1) {
            int a = heap.poll();
            int b = heap.poll();

            int diff = a - b;
            if(diff != 0) {
                heap.offer(diff);
            }
        }

        return heap.isEmpty() ? 0: heap.peek();
    }
}
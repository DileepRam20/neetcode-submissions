/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a,b)-> a.start - b.start);
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(Interval inter : intervals)
        {
            if(!q.isEmpty() && q.peek()<=inter.start)
            {
                q.poll();
            }
            q.offer(inter.end);
        }
        return q.size();
    }
}

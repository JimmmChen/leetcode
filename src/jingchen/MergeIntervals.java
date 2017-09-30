package jingchen;

public class MergeIntervals {
	 public List<Interval> merge(List<Interval> intervals) {
	        List<Interval> merged = new ArrayList<Interval>();
	        for(Interval i : intervals){
	            boolean flag = false;
	            for(Interval m : merged){
	                if(i.start > m.end || i.end < m.start)
	                    continue;
	                else{
	                    m.start = m.start < i.start ? m.start : i.start;
	                    m.end = m.end > i.end ? m.end : i.end;
	                    flag = true;
	                    break;
	                }
	            }
	            if(!flag)
	                merged.add(i);
	        }
	        if(merged.size() != intervals.size())
	            return merge(merged);
	        else 
	            return merged;
	    }
}

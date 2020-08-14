public class lc636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> stack =
                new Stack<Integer>();
        int[] array = new int[n];
        int prev_time = 0;
        for (String log: logs){
            String[] pairs = log.split(":");
            if (pairs[1].equals("start")){
                if (!stack.isEmpty()){
                    array[stack.peek()] += Integer.parseInt(pairs[2]) - prev_time;
                }
                stack.push(Integer.parseInt(pairs[0]));
                prev_time = Integer.parseInt(pairs[2]);
            }else{
                array[stack.pop()] += Integer.parseInt(pairs[2]) - prev_time + 1;
                prev_time = Integer.parseInt(pairs[2]) + 1;
            }
        }
        return array;
    }
}

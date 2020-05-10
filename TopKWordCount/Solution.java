package git.TopKWordCount;

import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
/*
TOP-K问题：前k个最大，创建小堆
           前K个最小，创建大堆
解题思路：
  假设有N个元素，返回N个元素中最大的前K个数，求解思路：
    1. 用前k个元素构建一个小堆
    2. 用剩余的元素依次和堆顶元素进行比较，如果比堆顶元素大，替换堆顶元素
    3. 堆中最终剩余的元素就是前K个最大的元素
*/

/*
比较器规则：
1. 如果用o1 - o2，创建的就是小堆
2. 如果用o2 - o1，创建的就是大堆
为什么？
*/
// 该比较器最终创建的是一个大堆
    class CmpKV implements Comparator<Map.Entry<String, Integer>>{
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
        if(o2.getValue() > o1.getValue()){
            return 1;
        }

        if(o2.getValue() == o1.getValue() && o1.getKey().compareTo(o2.getKey()) > 0){
            return 1;
        }

        if(o2.getValue() == o1.getValue() && o1.getKey().compareTo(o2.getKey()) == 0){
            return 0;
        }

        return -1;
    }
}

// 该题目虽然能正确的跑结果，但是性能不是很好
/*
1. 统计每个元素出现的次数
2. 用所有元素构建一个大堆
3. 取堆中前k个元素
缺陷：如果元素比较少，按照该种方式解决没有问题
      如果元素比较多，按照该种方式处理性能就太低了
大家按照TOP-K尝试修改下
*/
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // 1. 统计每个单词出现的次数
        Map<String, Integer> m = new HashMap<>();
        for(int i = 0; i < words.length; ++i){
            m.put(words[i], m.getOrDefault(words[i], 0)+1);
        }

        // 2. 创建一个优先级队列--所有元素放进去，创建一个堆
        PriorityQueue<Map.Entry<String, Integer>> p = new PriorityQueue<>(new CmpKV());
        for(Map.Entry<String, Integer> e : m.entrySet()){
            p.offer(e);
        }

        // 3. 取堆中的前K个元素
        List<String> lRet = new ArrayList<>(k);
        for(int i = 0; i < k; ++i){
            lRet.add(p.poll().getKey());
        }

        return lRet;
    }
}


package numBusesToDestination;

import java.util.ArrayList;
import java.util.*;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//我们有一系列公交路线。每一条路线 routes[i] 上都有一辆公交车在上面循环行驶。
// 例如，有一条路线 routes[0] = [1, 5, 7]，表示第一辆 (下标为0) 公交车会一
// 直按照 1->5->7->1->5->7->1->... 的车站路线行驶。
//假设我们从 S 车站开始（初始时不在公交车上），要去往 T 站。 期间仅可乘坐公
// 交车，求出最少乘坐的公交车数量。返回 -1 表示不可能到达终点车站。


public class Solution {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        // 特殊情况以及数据初始化
        if (S == T) return 0;
        if (routes == null || routes.length == 0) return -1;
        List<Integer> before = getRouteList(routes, S);// 起始车站所在的路线集合
        List<Integer> after = getRouteList(routes, T);// 终点车站所在的路线集合
        if (beforeContainAfter(before, after)) return 1;// 在一条路线上
        Boolean[] isVisited = new Boolean[routes.length];
        for (int i = 0; i < isVisited.length; i++) {
            if (before.contains(i)) {
                isVisited[i] = true;
            }
            isVisited[i] = false;
        }
        Map<Integer, List<Integer>> routeMap = new HashMap<>();// routeMap.get(i)的值表示与路线i存在公共车站的所有路线集合
        for (int i = 0; i < routes.length; i++) {
            for (int j = i + 1; j < routes.length; j++) {
                if (haveCommonStop(routes[i], routes[j])) {
                    if(!routeMap.containsKey(i)) routeMap.put(i, new ArrayList<>());
                    routeMap.get(i).add(j);
                    if(!routeMap.containsKey(j)) routeMap.put(j, new ArrayList<>());
                    routeMap.get(j).add(i);
                }
            }
        }

        if(routeMap==null || routeMap.size() ==0) return -1; // 所有路线无交集场景
        // 算法主体
        boolean hasReached = false;
        boolean noMoreAvailableStop = false;
        int count = 1;
        while (!hasReached && !noMoreAvailableStop) {
            // [1]开始从before向外拓展
            count++;
            // [2]求得当前before列表中相邻的所有路线集合，结果替换before然后进下一轮向外拓展
            List<Integer> canVisitList = canVisit(routeMap, before, isVisited);
            if (canVisitList.size() == 0) {
                noMoreAvailableStop = true;
            } else {
                before.clear();
                before = canVisitList;
                for (int beforeItem : before) {
                    isVisited[beforeItem] = true; //已探索过的结点不再探索
                }
            }
            // [3]当前before集合中是否存在一条路线也属于after集合
            if (beforeContainAfter(before, after)) hasReached = true;
        }
        if (hasReached) {
            return count;
        } else {
            return -1;
        }
    }
    public List<Integer> getRouteList(int[][] routes, int busStop) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                if (routes[i][j] == busStop && !result.contains(i)) result.add(i);
            }
        }
        return result;
    }
    public boolean haveCommonStop(int[] routes1, int[] routes2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < routes1.length && index2 < routes2.length) {
            if (routes1[index1] == routes2[index2]) {
                return true;
            } else if (routes1[index1] < routes2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }
        return false;
    }
    public List<Integer> canVisit(Map<Integer, List<Integer>> routeMap, List<Integer> before, Boolean[] isVisited) {
        List<Integer> result = new ArrayList<>();
        for (int beforeItem : before) {
            for(int routeItem: routeMap.get(beforeItem)){
                if(!result.contains(routeItem) && !before.contains(routeItem) && !isVisited[routeItem]){
                    result.add(routeItem);
                }
            }
        }
        return result;
    }
    public Boolean beforeContainAfter(List<Integer> before, List<Integer> after) {
        for (int afterItem : after) {
            if (before.contains(afterItem)) return true;
        }
        return false;
    }
}

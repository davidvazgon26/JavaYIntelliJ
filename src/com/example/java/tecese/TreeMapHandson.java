//package com.fresco;
package com.example.java.tecese;

import java.util.*;



public class TreeMapHandson {

    public TreeMap<Integer,String> createPlayerPositionMap(String cricketDataset)
    {

        TreeMap<Integer,String> playerPositionMap = new TreeMap<Integer,String>();
        String[] playerSet = cricketDataset.split("\\|");
        for(String player: playerSet){
            String[] playerDetails = player.split(",");
            playerPositionMap.put(Integer.parseInt(playerDetails[0].toString()), playerDetails[1]);
        }
        return playerPositionMap;

    }
    public TreeMap<String,Integer> createPlayerScoreMap(String cricketDataset)
    {

        TreeMap<String,Integer> playerScoreMap = new TreeMap<String,Integer>();
        String[] playerSet = cricketDataset.split("\\|");
        for(String player: playerSet){
            String[] playerDetails = player.split(",");
            playerScoreMap.put(playerDetails[1],Integer.parseInt(playerDetails[2].toString()));
        }
        return playerScoreMap;

    }
    public TreeMap<?,?> createMatchesMap(String cricketDataset)
    {

        TreeMap<String,Integer> nameWithNumberOfMatchesMap = new TreeMap<>();
        TreeMap<String,Integer> nameWithTotalScore = new TreeMap<>();
        TreeMap<String,Integer> nameWithAverageScore = new TreeMap<>();
        String[] playerDetailsSet = cricketDataset.split("\\n");
        String joinedPlayerSet = String.join("|",playerDetailsSet);
        String[] playerSet = joinedPlayerSet.split("\\|");
        for(String player: playerSet){
            String[] playerDetails = player.split(",");
            if(Integer.parseInt(playerDetails[0]) == 1){
                if(nameWithNumberOfMatchesMap.size() == 0 && nameWithTotalScore.size() == 0){
                    nameWithNumberOfMatchesMap.put(playerDetails[1],1);
                    nameWithTotalScore.put(playerDetails[1],Integer.parseInt(playerDetails[2]));
                }
                else {
                    if(nameWithNumberOfMatchesMap.get(playerDetails[1])!=null)
                        nameWithNumberOfMatchesMap.put(playerDetails[1],nameWithNumberOfMatchesMap.get(playerDetails[1])+1);
                    else
                        nameWithNumberOfMatchesMap.put(playerDetails[1],1);
                    if(nameWithTotalScore.get(playerDetails[1])!=null){
                        nameWithTotalScore.put(playerDetails[1],nameWithTotalScore.get(playerDetails[1])+Integer.parseInt(playerDetails[2]));
                    } else {
                        nameWithTotalScore.put(playerDetails[1],Integer.parseInt(playerDetails[2]));
                    }
                }
            }
        }
        for(Map.Entry<String,Integer> positionEntry: nameWithTotalScore.entrySet()){
            Integer averageScore = positionEntry.getValue() / nameWithNumberOfMatchesMap.get(positionEntry.getKey());
            nameWithAverageScore.put(positionEntry.getKey(),averageScore);
        }
        return nameWithAverageScore;

    }


    public String getQuery(String cricketDataset,String query)
    {

        String result = "";
        String[] queryType = query.split(" ");
        if(queryType.length == 3){
            Integer firstPosition = Integer.parseInt(queryType[1]);
            Integer endPosition = Integer.parseInt(queryType[2]);
            TreeMap<Integer,String> playerPositionMap = this.createPlayerPositionMap(cricketDataset);
            for(Map.Entry<Integer,String> entry: playerPositionMap.entrySet()){
                if(entry.getKey() >= firstPosition && entry.getKey() <= endPosition)
                    result = result + entry.getKey().toString()+ " "+entry.getValue()+"\n";
            }
        }
        else if(queryType.length == 2){
            TreeMap<Integer,String> resultMap = new TreeMap<>();
            Integer thresholdScore = Integer.parseInt(queryType[1]);
            TreeMap<String,Integer> playerScoreMap = this.createPlayerScoreMap(cricketDataset);
            TreeMap<Integer,String> playerPositionMap = this.createPlayerPositionMap(cricketDataset);
            Integer position = 0;
            for(Map.Entry<String,Integer> entry: playerScoreMap.entrySet()) {
                if(entry.getValue() > thresholdScore) {
                    for(Map.Entry<Integer,String> positionEntry: playerPositionMap.entrySet()) {
                        if(positionEntry.getValue().equals(entry.getKey())) {
                            position = positionEntry.getKey();
                        }
                    }
                    resultMap.put(position, entry.getKey());
                }
            }
            for (Map.Entry<Integer,String> resultEntry: resultMap.entrySet()) {
                result = result + resultEntry.getKey().toString() + " "+resultEntry.getValue() + "\n";
            }
        }
        else if(queryType.length == 1) {
            TreeMap<String,Integer> nameWithAverageScore = (TreeMap<String, Integer>) createMatchesMap(
                    cricketDataset);
            Map.Entry<String,Integer> maxEntry = null;
            for(Map.Entry<String,Integer> entry: nameWithAverageScore.entrySet()) {
                if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }
            }
            result = "The Efficient Opener is "+ maxEntry.getKey();
        }
        return result;

    }

}





/*

 import java.util.HashSet;import java.util.TreeMap;

public class Cricket {
    public static TreeMap<Integer, String> createPlayerPositionMap(String cricketDataset) {
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] dataSet = cricketDataset.split("\\|");
        for (String dSet : dataSet) {
            String[] data = dSet.split(",");
            Integer pos = Integer.parseInt(data[0]);
            String p = data[1];
            map.put(pos, p);
        }
        return map;
    }

    public static TreeMap<String, Integer> createPlayerScoreMap(String cricketDataset) {
        TreeMap<String, Integer> map = new TreeMap<>();
        String[] dataSet = cricketDataset.split("\\|");
        for (String dSet : dataSet) {
            String[] data = dSet.split(",");
            String p = data[1];
            Integer score = Integer.parseInt(data[2]);
            map.put(p, score);
        }
        return map;
    }

    public static TreeMap<String, Double> createMatchesMap(String cricketDataset) {
        String[] dataSet = cricketDataset.split("\\|");
        TreeMap<String, Score> finalMap = new TreeMap<>();
        for (String dSet : dataSet) {
            String[] data = dSet.split(",");
            Integer score = Integer.parseInt(data[2]);
            String p = data[1];
            if (finalMap.containsKey(p)) {
                Score sc = finalMap.get(p);
                sc.count++;
                sc.score += score;
                finalMap.put(p, sc);
            } else {
                finalMap.put(p, new Score(score, 1));
            }
        }
        TreeMap<String, Double> scoreMap = new TreeMap<>();
        for (String p : finalMap.keySet()) {
            double v = finalMap.get(p).score / (double) finalMap.get(p).count;
            scoreMap.put(p, v);
        }
        return scoreMap;
    }

    public static String getQuery(String cricketDataset, String query) {
        String str = "";
        String[] queryData = query.split(" ");
        int queryType = Integer.parseInt(queryData[0]);
        if (queryType == 1) {
            TreeMap<Integer, String> map = createPlayerPositionMap(cricketDataset);
            for (Integer pos : map.keySet()) {
                int startPos = Integer.parseInt(queryData[1]);
                int endPos = Integer.parseInt(queryData[2]);
                if (pos >= startPos && pos <= endPos) {
                    str += "" + pos + " " + map.get(pos) + "\n";
                }
            }
        }
        if (queryType == 2) {
            TreeMap<Integer, String> posMap = createPlayerPositionMap(cricketDataset);
            TreeMap<String, Integer> scoreMap = createPlayerScoreMap(cricketDataset);
            HashSet<String> players = new HashSet<>();
            for (String p : scoreMap.keySet()) {
                int threshold = Integer.parseInt(queryData[1]);
                if (threshold <= scoreMap.get(p)) {
                    players.add(p);
                }
            }
            for (Integer pos : posMap.keySet()) {
                if (players.contains(posMap.get(pos))) {
                    str += "" + pos + " " + posMap.get(pos) + "\n";
                }
            }
        }
        if (queryType == 3) {
            TreeMap<String, Double> scoreMap = createMatchesMap(cricketDataset);
            double max = 0.0;
            String player = null;
            for (String p : scoreMap.keySet()) {
                if (scoreMap.get(p) >= max) {
                    max = scoreMap.get(p);
                    player = p;
                }
            }
            str += "The Efficient Player is " + player + "\n";
        }
        return str;
    }

    public static class Score {
        public int count;
        public double score;

        public Score(int count, double score) {
            this.count = count;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        String dataSet = "3,Dhoni,120|1,Virat,103|5,Jadeja,30|2,Rohit,70|4,Pandya,40";
        System.out.println(getQuery(dataSet, "1 3 5"));
        System.out.println(getQuery(dataSet, "2 50"));
        String dataSet3 = "3,Rohit,10|3,Rohit,13|3,Jadeja,30|2,Rohit,60|4,Pandya,40|3,Rohit,100|3,Rohit,103|3,Jadeja,30|2,Rohit,70|4,Pandya,40";
        System.out.println(getQuery(dataSet3, "3"));
    }
}


 */





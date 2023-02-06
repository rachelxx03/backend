package com.feature.backend.service;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class FindSimilarity {


    private String rawData = " ";

    /**
     * find the cosineSimilarity for 2 vector
     *
     */


    public double cosineSimilarity(ArrayList<Double> vector1, ArrayList<Double> vector2) {
        double dotProduct = 0.0;
        double A = 0.0;
        double B = 0.0;
        for (int i = 0; i < vector1.size(); i++) {
            dotProduct += vector1.get(i) * vector2.get(i);
            A += Math.pow(vector1.get(i), 2);
            B += Math.pow(vector2.get(i), 2);
        }
        return dotProduct / (Math.sqrt(A) * Math.sqrt(B));
    }

    /**
     * Load the data file
     * @param rawData is a string from each ranking
     *
     */

    public FindSimilarity(String rawData){
        this.rawData = rawData;
    }

    /**
     * count the number of word appear in the string
     *
     */
    public Map<String, Integer> sortedData (){
        String[] splittedByCommadata =  rawData.split(",");
        Map<String, Integer> countedWord = new TreeMap<String, Integer>();
        for( String value : splittedByCommadata ) {
            if(!countedWord.containsKey(value)){
                countedWord.put(value,1);
            }else {
                int  previousvalue = countedWord.get(value);
                countedWord.put(value,previousvalue+1);
            }
        }
        return countedWord;
    }

    /**
     * remove word that appear less than 3
     *
     */

    public   Map<String, Integer> noiselessSortedData(){
        Map<String, Integer> noiseData = sortedData();
        Map<String, Integer> noiselessData= new TreeMap<String, Integer>();
        for (Map.Entry<String, Integer>
                entry : noiseData.entrySet()) {
            if(entry.getValue()>2){
                noiselessData.put(entry.getKey(),entry.getValue());
            }
        }
        return noiselessData;
    }

    /**
     *get the total of all word appear
     *
     */

    public  int getTotalPointMap(){
        Map<String, Integer> noiselessSortedData = noiselessSortedData();
        int totalPoint = 0;
        for (Map.Entry<String, Integer>
                entry :  noiselessSortedData.entrySet()) {
            totalPoint+=entry.getValue();
        }
        return totalPoint;
    }



    /**
     *create vector from the data
     *
     */

    public ArrayList<Double> DataScoreVector(){
        Map<String, Integer> noiselessSortedData = noiselessSortedData();
        ArrayList<Double> dataScoreVector  = new ArrayList<Double>();
        int totalPoint = getTotalPointMap();
        for (Map.Entry<String, Integer>
                entry :  noiselessSortedData.entrySet()) {

            dataScoreVector.add(((double)entry.getValue()/(double) totalPoint));

        }
        return dataScoreVector;
    }

    /**
     *create vector from the input
     *
     */


    public   ArrayList<Double> InputScoreVector(String InputData){
        String[] splittedBySpacedata = InputData.split(" ");
        Map<String, Integer> noiselessSortedData = noiselessSortedData();
        ArrayList<Integer> inputScoreVector  = new ArrayList<Integer>();
        for (Map.Entry<String, Integer>
                entry :  noiselessSortedData.entrySet()) {
            int count=0;
            for (String strTemp : splittedBySpacedata){

                if(strTemp.equals(entry.getKey())){
                    count++;

                }
            }
            inputScoreVector.add(count);

        }
        ArrayList<Double> FinalCompareArray  =getFinalCompareArray(inputScoreVector);
        return FinalCompareArray;
    }

    /**
     *return calculate the total of word appear in input data
     *
     */

    public ArrayList<Double>  getFinalCompareArray(ArrayList<Integer> inputData){
        double sum = 0;
        ArrayList<Double> finaldata = new ArrayList<Double>();

        for(Integer d :inputData)
            sum += d;

        for(Integer d :inputData)
            if(sum !=0 ){
                finaldata.add((double)d/sum);
            }else{
                finaldata.add((double)d);

            }

        return finaldata;
    }
}

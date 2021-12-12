package com.supreme.bot;

import weka.classifiers.meta.FilteredClassifier;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.filters.unsupervised.attribute.Remove;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.internal.*;

import java.io.*;
import java.util.*;

public class Ai {

    public void predictStocks(){
         try{
             return 'mainRead()';
         } catch(Exception e){
             return (e);
         }
    }

    /**public String mainRead() throws Exception {
        Instances training_data = new Instances(new BufferedReader(new FileReader("C:\\Users\\Pavilion\\Documents\\GitHub\\emyeco\\test_data\\stock_training_data.arff")));
		training_data.setClassIndex(training_data.numAttributes() - 1);

		Instances testing_data = new Instances(new BufferedReader(new FileReader("C:\\Users\\Pavilion\\Documents\\Benn_Co\\stock_data.arff")));
		testing_data.setClassIndex(training_data.numAttributes() - 1);

		String summary = training_data.toSummaryString();
		int number_samples = training_data.numInstances();
		int number_attributes_per_sample = training_data.numAttributes();
        System.out.println("Number of attributes in model = " + number_attributes_per_sample);
        System.out.println("Number of samples = " + number_samples);
        System.out.println("Summary: " + summary);
        System.out.println();
        
        // a classifier for decision trees:
        J48 j48 = new J48();
        
        // filter for removing samples:
        Remove rm = new Remove();
        rm.setAttributeIndices("1");  // remove 1st attribute

        // filtered classifier
        FilteredClassifier fc = new FilteredClassifier();       
        fc.setFilter(rm);
        fc.setClassifier(j48);
        // train using stock_training_data.arff:
        fc.buildClassifier(training_data);
        // test using stock_testing_data.arff:
        for (int i = 0; i < testing_data.numInstances(); i++) {
          double pred = fc.classifyInstance(testing_data.instance(i));
           
          given_value = testing_data.classAttribute().value((int)testing_data.instance(i).classValue());
          System.out.print("given value: " + getGiven_value());
          
          predicted_value =testing_data.classAttribute().value((int) pred);
          System.out.println(" predicted value: " + getPredicted_value());
        } 

        return 'predicted value:';

	}*/

}
package main;

import classify.LabeledDatum;
import classify.ReviewDatum;
import classify.ReviewFeatures;
import classify.StratifiedCrossValidation;
import io.LabeledDataSet;
import math.DifferentiableMatrixFunction;
import math.Norm1Tanh;
import parallel.Parallel;
import rae.FineTunableTheta;
import rae.LabeledRAETree;
import rae.RAECost;
import rae.RAEFeatureExtractor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/1/18.
 */
public class test {
    public static void main(String[] args) throws IOException {
//        String[] paramStr = {
//                "-DataDir", "F:\\data\\raetest\\parsed",
//                "-TrainModel", "true",
//                "-ModelFile", "modelFile.txt",
//                "-ClassifierFile", "F:\\data\\raetest\\classifier.txt",
//                "-TreeDumpDir", "F:\\data\\raetest\\treeDumpdir",
////                "-WordMapFile","F:\\data\\raetest\\wordmap.txt",
////                "-LabelMapFile","F:\\data\\raetest\\labels.txt",
//                "featuresOutputFile", "F:\\data\\raetest\\features.txt",
//                "ProbabilitiesOutputFile", "F:\\data\\raetest\\probabilities.txt"
//        };
//        //-size 5 -verbose
//
//        Arguments params = new Arguments();
//        params.parseArguments(paramStr);
//
//        if (params.exitOnReturn)
//            return;
//
//        RAECost RAECost = null;
//        FineTunableTheta InitialTheta = null;
//        RAEFeatureExtractor FeatureExtractor = null;
//        DifferentiableMatrixFunction f = new Norm1Tanh();
//
//        System.out.printf("%d\n%d\n", params.DictionarySize, params.hiddenSize);
//
//        StratifiedCrossValidation<LabeledDatum<Integer, Integer>, Integer, Integer> cv
//                = new StratifiedCrossValidation<LabeledDatum<Integer, Integer>, Integer, Integer>(params.NumFolds, params.Dataset);
//        FineTunableTheta tunedTheta = null;
//        FeatureExtractor = new RAEFeatureExtractor(params.EmbeddingSize, tunedTheta,
//                params.AlphaCat, params.Beta, params.CatSize, params.DictionarySize, f);
//        for (int foldNumber = 0; foldNumber < params.NumFolds; foldNumber++) {
//            long startTime = System.nanoTime();
//            InitialTheta = new FineTunableTheta(params.EmbeddingSize, params.EmbeddingSize,
//                    params.CatSize, params.DictionarySize, true);
//
//            List<LabeledDatum<Integer, Integer>> trainingData = cv.getTrainingData(foldNumber); //,numFolds);
//            List<LabeledDatum<Integer, Integer>> testData = cv.getValidationData(foldNumber);
//            for (LabeledDatum<Integer, Integer> datum : trainingData) {
//                System.out.println(datum + "\t" + datum.getLabel() + "\t" + datum.getFeatures());
//                System.out.println(InitialTheta.We.getColumn(0));
//            }
//
//            List<LabeledDatum<Double, Integer>> classifierTrainingData
//                    = FeatureExtractor.extractFeaturesIntoArray(trainingData);
//        }
        System.out.println("test");
    }

//    public List<LabeledDatum<Double, Integer>> extractFeaturesIntoArray(
//            final LabeledDataSet<LabeledDatum<Integer, Integer>, Integer, Integer> dataset,
//            final List<LabeledDatum<Integer, Integer>> Data, final String treeDumpDir) {
//
//
//        final int numExamples = Data.size();//dataExamples = 54
//        final LabeledDatum<Double, Integer>[] DataFeatures = new ReviewFeatures[numExamples];//dataFeatures:
//        final boolean dump = (dataset != null && treeDumpDir != null);//dump: false
//        try {
//            File treeStructuresFile = new File(treeDumpDir, "treeStructures.txt");
//            FileWriter treeStructuresFileWriter = new FileWriter(treeStructuresFile.getAbsolutePath(), true);
//            final BufferedWriter treeStructuresStream = new BufferedWriter(treeStructuresFileWriter);
//
//            /*** Actual feature extraction and dumping ***/
//            Parallel.For(Data, new Parallel.Operation<LabeledDatum<Integer, Integer>>() {
//                @Override
//                public void perform(int index, LabeledDatum<Integer, Integer> data) {
//                    {
//                        ReviewFeatures r = new ReviewFeatures(null, data.getLabel(), index, null);
//                        DataFeatures[index] = r;
//                        System.out.println(data.getLabel());
//                    }
//
//                }
//            });
//            System.gc();
//
//            treeStructuresStream.close();
//            treeStructuresFileWriter.close();
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//            e.printStackTrace();
//        }
//
//        return Arrays.asList(DataFeatures);
//    }
}

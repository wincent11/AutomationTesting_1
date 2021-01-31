package PaintJob;

import methods.Methods;
import org.w3c.dom.ls.LSResourceResolver;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0. || height <= 0.) {
            return -1;
        } else {
            return (int) Math.ceil(width * height / areaPerBucket - extraBuckets);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0. || height <= 0.) {
            return -1;
        } else {
            return (int) Math.ceil(width * height / areaPerBucket);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return (int) Math.ceil(area / areaPerBucket);
    }
}
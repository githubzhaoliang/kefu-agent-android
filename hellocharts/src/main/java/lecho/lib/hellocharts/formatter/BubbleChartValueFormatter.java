package lecho.lib.hellocharts.formatter;

import lecho.lib.hellocharts.model.BubbleValue;

public interface BubbleChartValueFormatter {

    int formatChartValue(char[] formattedValue, BubbleValue value);
}

package com.xbreeze.xtest.modules.result;

import com.xbreeze.xtest.database.helpers.DataHelper;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.modules.data.database.Database_Helper;
import com.xbreeze.xtest.result.ResultContext;

import io.cucumber.datatable.DataTable;

public class Result_Helper extends Database_Helper{
	
	public Result_Helper(ResultContext resultContext, DataHelper dataHelper) throws XTestException {
		super(resultContext, dataHelper);
	}
	
	public void CompareExpectedAndActualResult(DataTable results) throws Throwable{
		//Transform expected results to row set and feed it to compare
		_resultContext.compareResult(results);
	}
	
	public void StoreContentsOfFieldInVariable(String fieldName, String variableName) throws Throwable{
		_resultContext.setVariable(fieldName, variableName);
	}

}

package main.model;

import main.dao.IReportGenerator;

public class ReportGenerator implements IReportGenerator {
    @Override
    public String generateTicketSalesReport(String startDate, String endDate) throws CustomException {
        return null;
    }

    @Override
    public String generateProductSalesReport(String startDate, String endDate) throws CustomException {
        return null;
    }
}

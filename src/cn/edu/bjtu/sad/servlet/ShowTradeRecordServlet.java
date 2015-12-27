package cn.edu.bjtu.sad.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.bjtu.sad.dao.TradeRecordDao;
import cn.edu.bjtu.sad.dao.imp.TradeRecordDaoImp;
import cn.edu.bjtu.sad.model.TradeRecord;


/**
 * This servlet is used to deal with trade record presentation.
 * @author sunshine
 *
 */
public class ShowTradeRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<TradeRecord> records = new ArrayList<TradeRecord>();
		TradeRecordDao trdao = new TradeRecordDaoImp();
		records = trdao.getTradeRecord();
		
		request.setAttribute("records", records);
		request.getRequestDispatcher("financial_list.jsp").forward(request, response);
	}
}

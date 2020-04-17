package com.clv.wpm.esb.working;

import java.sql.SQLException;

public interface CommonsObjectDao extends Cloneable {
		public int getCntrPoint(String cntrNo);
		public void getSeqNo(String cntrNo) throws SQLException;
		public String getVessel(String cntrNo) throws SQLException;
}

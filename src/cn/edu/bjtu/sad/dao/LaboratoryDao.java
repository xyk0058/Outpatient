package cn.edu.bjtu.sad.dao;

import java.util.ArrayList;

import cn.edu.bjtu.sad.model.Laboratory;

/**
 * This interface is used for operate laboratory data.
 * @author sunshine
 *
 */
public interface LaboratoryDao {
	public boolean deleteLaboratory(String laboratory_id);
	public int addLaboratory(Laboratory laboratory);
	public ArrayList<Laboratory> getLaboratoryList();
}

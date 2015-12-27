package cn.edu.bjtu.sad.dao;

import java.util.ArrayList;

import cn.edu.bjtu.sad.model.Medicine;

/**
 * This interface is used for operate midicine data.
 * @author sunshine
 *
 */
public interface MedicineDao {
	public boolean deleteMedicine(String medicine_id);
	public int addMedicine(Medicine medicine);
	public ArrayList<Medicine> getMedicineList();
	public Medicine getMedicine(int medicine_id);
}

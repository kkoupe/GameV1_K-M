package game_v1_util;

/**
 * �������������
 * @author koupe & meng
 *
 */

public class CreateRandom {
	/**
	 * ���ݹ���ȼ������������
	 * @param level	�ȼ�
	 * @param times	����
	 * @param range	������Χ
	 * @return		���ɵ�����ֵ
	 */
	public static int CreateRandomMonsterAttributes(int level, int times, int range) {
		int max = (100 + range) * times * level / 100;			//��������
		int min = (100 - range) * times * level / 100;			//��������
	    long randomNum = System.currentTimeMillis() * (int)(Math.random() * 10 + 1);
	    int result = (int) (randomNum % (max - min) + min);	//�����������ֵ
		return result;
	}
	
	public static int CreatRandomHeroAttributes(int heroType) {
		
		int result = 0;
		return result;
	}
}
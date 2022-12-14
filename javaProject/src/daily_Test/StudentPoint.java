package daily_Test;

public class StudentPoint {

		static String[] name = {"홍길동","사임당","이순신"};
		static int[] num= {1001,1002,1003};
		static int[] java= {90,95,100};
		static int[] db= {85,79,84};
		static int[] html= {99,88,92};
		static int[] jsp= {76,92,95};
		static int[] tot= {0,0,0}; 
		static double[] avg= {0.0,0.0,0.0};



		static void getTot() {
			for(int i=0;i<num.length;i++) {
				tot[i] = java[i] +db[i] + html[i] + jsp[i];
			}
		}

		static void getAvg() {
			for(int i =0;i <num.length;i++) {
				avg[i]=tot[i]/3.0;
			}
		}
		static void print() {
			System.out.println("전체 학생수: 3명");
			System.out.println("-----------------------------------------------------");
			System.out.println("학번\t이름\tJAVA\tDB\thtml\tjsp\t총점\t평균");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<num.length;i++) {
				System.out.println(num[i]+"\t"+name[i]+"\t"+java[i]+"\t"+db[i]+"\t"+html[i]+"\t"+jsp[i]+"\t"+tot[i]+"\t"+String.format("%.1f",avg[i]));

			}		System.out.println("-----------------------------------------------------");
		}
		public static void main(String[] args) {
			getTot();
			getAvg();
			print();
		}
		
	}



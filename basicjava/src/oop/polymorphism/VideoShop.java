package oop.polymorphism;

/**
 * VideoShop
 * @author Playdata
 * 설명 : 비디오를 판매중에 있습니다.
 */
public class VideoShop {
	public static void main(String[] args) {
		
		long firstStartTime = System.currentTimeMillis();
		
		// 장바구니
		Content[] content = new Content[3];
		content[0] = new Video("변호인","new");
		content[1] = new Video("탐정","comic");
		content[2] = new Video("헬로카봇","child");
		// 카운터에서 계산 
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
		long firstEndTime = System.currentTimeMillis();
		
//		long firstTakenTime = (firstEndTime - firstStartTime)/1000;
		long firstTakenTime = (firstEndTime - firstStartTime); 

		
		System.out.println("첫번째 로직 걸린 시간 : " + firstTakenTime);
		
	}
}

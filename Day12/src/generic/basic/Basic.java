package generic.basic;

public class Basic <K,V> {//멀티 제너릭
	
	private K key;
	private V value;
	
	public void set(K key, V value) {
		
		this.key =key;
		this.value=value;
		
		
	}
	
	//K를 받으면 V를 돌려준다.
	
	public V get(K key) {
		return value;
	}

	@Override
	public String toString() {
		return "{" + key + "=" + value + "}";
	}
	
	
	
}

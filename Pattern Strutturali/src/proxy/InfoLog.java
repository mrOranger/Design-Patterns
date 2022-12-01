package proxy;

import java.time.LocalDateTime;

public class InfoLog implements Log{

	@Override
	public void log(String message) {
		System.out.println("[".concat(LocalDateTime.now().toString()).concat("] - info - ").concat(message));
	}

}

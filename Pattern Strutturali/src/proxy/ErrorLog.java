package proxy;

import java.time.LocalDateTime;

public class ErrorLog implements Log {
	@Override
	public void log(String message) {
		System.out.println("[".concat(LocalDateTime.now().toString()).concat("] - error - ").concat(message));
	}

}

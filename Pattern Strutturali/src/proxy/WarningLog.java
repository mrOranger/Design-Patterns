package proxy;

import java.time.LocalDateTime;

public class WarningLog implements Log{
	
	@Override
	public void log(String message) {
		System.out.println("[".concat(LocalDateTime.now().toString()).concat("] - warning - ").concat(message));
	}

}

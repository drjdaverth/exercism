import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshakeList = new ArrayList<>();
        if ((number & 1) == 1) {
            handshakeList.add(Signal.WINK);
        }
        if ((number & 2) == 2) {
            handshakeList.add(Signal.DOUBLE_BLINK);
        }
        if ((number & 4) == 4) {
            handshakeList.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((number & 8) == 8) {
            handshakeList.add(Signal.JUMP);
        }
        if ((number & 16) == 16) {
            Collections.reverse(handshakeList);
        }
        return handshakeList;
    }

}
import android.os.Bundle;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_androidagent_1380741871 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Message.class);
      Bundle var2 = ((Message)var1).peekData();
   }
}

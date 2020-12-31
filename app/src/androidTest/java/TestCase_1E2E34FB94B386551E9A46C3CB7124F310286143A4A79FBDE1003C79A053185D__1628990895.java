import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import androidx.test.runner.AndroidJUnit4;
import java.lang.reflect.Field;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1E2E34FB94B386551E9A46C3CB7124F310286143A4A79FBDE1003C79A053185D__1628990895 {
   @Test
   public void testCase() throws Exception {
      Class var1 = MessageQueue.class;
      Field var2 = var1.getDeclaredField("mMessages");
      Field var6 = var2;
      var1 = Looper.class;
      var2 = var1.getDeclaredField("mQueue");
      Looper var9 = Looper.getMainLooper();
      Object var10 = var2.get(var9);
      MessageQueue var11 = (MessageQueue)var10;
      MessageQueue var3 = var11;
      var11 = var9.getQueue();
      Object var7 = var6.get(var3);
      Message var8 = (Message)var7;
      long var4 = var8.getWhen();
   }
}

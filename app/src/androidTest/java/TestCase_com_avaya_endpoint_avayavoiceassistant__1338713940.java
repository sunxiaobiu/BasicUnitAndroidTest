import android.content.ComponentName;
import android.content.Context;
import android.speech.SpeechRecognizer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_avaya_endpoint_avayavoiceassistant__1338713940 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      SpeechRecognizer.createSpeechRecognizer((Context)var0, (ComponentName)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}

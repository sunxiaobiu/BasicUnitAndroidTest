import android.content.Context;
import android.speech.SpeechRecognizer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_andrewsoft_vc__369941692 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      boolean var1 = SpeechRecognizer.isRecognitionAvailable((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}

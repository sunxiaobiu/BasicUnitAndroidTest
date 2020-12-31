import android.content.Context;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_andrewsoft_vc_29617762 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      SpeechRecognizer var3 = SpeechRecognizer.createSpeechRecognizer(var2);
      Object var1 = EasyMock.createMock(RecognitionListener.class);
      var3.setRecognitionListener((RecognitionListener)var1);
   }
}

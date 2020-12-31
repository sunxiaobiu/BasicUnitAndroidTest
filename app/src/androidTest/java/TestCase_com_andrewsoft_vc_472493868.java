import android.content.Context;
import android.speech.SpeechRecognizer;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_andrewsoft_vc_472493868 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      SpeechRecognizer var2 = SpeechRecognizer.createSpeechRecognizer(var1);
      var2.stopListening();
   }
}

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_nk_tools_iTranslate_924196421 {
   @Test
   public void testCase() throws Exception {
      OnInitListener var3 = (OnInitListener)this;
      Context var1 = InstrumentationRegistry.getTargetContext();
      TextToSpeech var2 = new TextToSpeech(var1, var3);
      Set var4 = var2.getVoices();
   }
}

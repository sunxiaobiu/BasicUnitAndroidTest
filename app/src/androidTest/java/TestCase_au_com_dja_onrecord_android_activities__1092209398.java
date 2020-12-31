import android.media.AudioRecord;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_dja_onrecord_android_activities__1092209398 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AudioRecord.class);
      int var2 = ((AudioRecord)var1).getState();
   }
}

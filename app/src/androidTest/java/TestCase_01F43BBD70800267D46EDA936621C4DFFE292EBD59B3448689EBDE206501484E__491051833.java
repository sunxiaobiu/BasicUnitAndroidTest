import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.session.MediaButtonReceiver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E__491051833 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MediaSessionCompat.class);
      Object var1 = EasyMock.createMock(Intent.class);
      MediaButtonReceiver.handleIntent((MediaSessionCompat)var0, (Intent)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}

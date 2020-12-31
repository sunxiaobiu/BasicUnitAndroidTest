import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59A9BD625B8CD06FB2577A17DECDF2945B12E6726B4558F6D109D0E1A2992EC2__896090932 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Resources var4 = var3.getResources();
      AssetFileDescriptor var5 = var4.openRawResourceFd(2131034112);
      long var1 = var5.getDeclaredLength();
   }
}

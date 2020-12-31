import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.BundleCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F6BAD148C6989ADE2EDE5BB6A934439D27D7996FF9EAC6BEDCA0CE9955D720__1983667707 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bundle.class);
      BundleCompat.putBinder((Bundle)var0, "android.support.customtabs.extra.SESSION", (IBinder)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}

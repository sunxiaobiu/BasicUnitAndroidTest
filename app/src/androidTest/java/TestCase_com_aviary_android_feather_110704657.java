import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.os.AsyncTaskCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aviary_android_feather_110704657 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Context[].class);
      AsyncTaskCompat.executeParallel((AsyncTask)var0, (Object[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}

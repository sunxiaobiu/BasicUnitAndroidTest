import android.content.pm.PackageInfo;
import androidx.core.content.pm.PackageInfoCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0758A49CB1A80E521FF9BD600016AFF9FB212B458362852CF61C0A1F429BEF28__1482570073 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PackageInfo.class);
      long var0 = PackageInfoCompat.getLongVersionCode((PackageInfo)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}

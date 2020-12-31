import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ibm_android_sametime__1057714663 {
   @Test
   public void testCase() throws Exception {
      ArrayList var2 = new ArrayList();
      Object var3 = EasyMock.createMock(List.class);
      Iterator var4 = ((List)var3).iterator();
      var3 = var4.next();
      Intent var5 = (Intent)var3;
      LabeledIntent var6 = (LabeledIntent)var5;
      Object var1 = EasyMock.createMock(PackageManager.class);
      var6.loadLabel((PackageManager)var1);
   }
}

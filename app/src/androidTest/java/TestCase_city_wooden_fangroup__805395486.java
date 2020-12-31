import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import java.lang.ref.WeakReference;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_city_wooden_fangroup__805395486 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(AppCompatActivity.class);
      WeakReference var1 = new WeakReference(var3);
      var3 = var1.get();
      AppCompatActivity var4 = (AppCompatActivity)var3;
      Object var5 = EasyMock.createMock(Fragment.class);
      Object var2 = EasyMock.createMock(Intent.class);
      var4.startActivityFromFragment((Fragment)var5, (Intent)var2, 100);
   }
}

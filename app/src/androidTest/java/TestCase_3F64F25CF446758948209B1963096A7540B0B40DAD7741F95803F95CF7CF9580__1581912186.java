import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3F64F25CF446758948209B1963096A7540B0B40DAD7741F95803F95CF7CF9580__1581912186 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Context var1 = var2.createDeviceProtectedStorageContext();
      Object var3 = EasyMock.createMock(Context.class);
      var2.moveSharedPreferencesFrom((Context)var3, "settings");
   }
}

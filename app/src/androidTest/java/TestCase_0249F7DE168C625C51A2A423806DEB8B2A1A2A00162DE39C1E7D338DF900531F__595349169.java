import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__595349169 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Intent.class);
      Object var2 = EasyMock.createMock(Bundle.class);
      var3.startActivity((Intent)var1, (Bundle)var2);
   }
}

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_alldictdict_alldict_tlen__200986395 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      ContentResolver var3 = var2.getContentResolver();
      Object var1 = EasyMock.createMock(Uri.class);
      var3.openTypedAssetFileDescriptor((Uri)var1, "text/*", (Bundle)null);
   }
}

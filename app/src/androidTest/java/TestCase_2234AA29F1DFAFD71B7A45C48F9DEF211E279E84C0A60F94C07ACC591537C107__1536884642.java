import android.os.Bundle;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2234AA29F1DFAFD71B7A45C48F9DEF211E279E84C0A60F94C07ACC591537C107__1536884642 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(PrintDocumentAdapter.class);
      Object var1 = EasyMock.createMock(PrintAttributes.class);
      Object var2 = null;
      ((PrintDocumentAdapter)var3).onLayout((PrintAttributes)null, (PrintAttributes)var1, (CancellationSignal)null, (LayoutResultCallback)var2, (Bundle)null);
   }
}

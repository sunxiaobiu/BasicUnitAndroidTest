import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R.layout;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F11FDEFF567AF8E29BB8C01674605340284B0198D3B0F7E0AE7B13202477E64__306484509 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      LayoutInflater var3 = LayoutInflater.from(var2);
      int var1 = layout.abc_screen_simple;
      View var4 = var3.inflate(var1, (ViewGroup)null);
      ViewGroup var5 = (ViewGroup)var4;
      FitWindowsViewGroup var7 = (FitWindowsViewGroup)var5;
      Object var6 = null;
      var7.setOnFitSystemWindowsListener((OnFitSystemWindowsListener)var6);
   }
}

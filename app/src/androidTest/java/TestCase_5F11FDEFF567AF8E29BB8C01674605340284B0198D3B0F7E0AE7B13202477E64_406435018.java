import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F11FDEFF567AF8E29BB8C01674605340284B0198D3B0F7E0AE7B13202477E64_406435018 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      LayoutInflater var1 = LayoutInflater.from(var2);
      int var3 = layout.abc_screen_toolbar;
      View var4 = var1.inflate(var3, (ViewGroup)null);
      ViewGroup var5 = (ViewGroup)var4;
      var3 = id.decor_content_parent;
      var4 = var5.findViewById(var3);
      DecorContentParent var7 = (DecorContentParent)var4;
      Object var6 = EasyMock.createMock(Callback.class);
      var7.setWindowCallback((Callback)var6);
   }
}
